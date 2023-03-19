from fastapi import Depends, FastAPI, File, UploadFile, Request
from fastapi.responses import FileResponse
import crud
from pydantic import BaseModel

class Service(BaseModel):
    client_id: int
    service_type: str
    service_details: str

app = FastAPI()

@app.post("/create_service")
def create_service(service: Service):
    crud.create_service(service.dict())
    
@app.get("/service/{service_id}")
def get_service(service_id: int):
     return crud.get_service(service_id)
    
@app.get("/service")
def get_services():
     return crud.get_services()

@app.patch("/change_service_data/{service_id}")
def change_service_data(service_id: int, new_client_id: int | None = None, new_type: str | None = None, new_data: str | None = None):
    crud.patch_service(service_id, new_client_id, new_type, new_data)

@app.delete("/delete_service/{service_id}")
def delete_service(service_id: int):
    crud.delete_service(service_id)