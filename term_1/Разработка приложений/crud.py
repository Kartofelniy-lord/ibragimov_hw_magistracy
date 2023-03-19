import database

def create_service(new_service: dict):
    database.LegalServices.create(**new_service)

def get_service(id: int):
    return database.LegalServices.select().where(database.LegalServices.id == id).dicts().get()

def get_services():
    return list(database.LegalServices.select().dicts())

def patch_service(service_id: int, new_client_id: int | None = None, new_type: str | None = None, new_details: str | None = None):
    if(new_client_id):
         database.LegalServices.update({database.LegalServices.client_id: new_client_id}).where(database.LegalServices.id == service_id).execute()
    if(new_type):
        database.LegalServices.update({database.LegalServices.service_type: new_type}).where(database.LegalServices.id == service_id).execute()
    if(new_details):
        database.LegalServices.update({database.LegalServices.service_details: new_details}).where(database.LegalServices.id == service_id).execute()

def delete_service(service_id: int):
    database.LegalServices.delete_by_id(service_id)