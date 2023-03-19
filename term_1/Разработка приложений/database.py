from peewee import *

pg_db = PostgresqlDatabase('hw', user='postgres', password='123',
                           host='localhost', port=5432)

class BaseModel(Model):
    class Meta:
        database = pg_db

class LegalServices(BaseModel):
    client_id = IntegerField(column_name='ID клиента')
    service_type = TextField(column_name='Тип услуги')
    service_details = TextField(column_name='Детали услуги', null=True)

    class Meta:
        table_name = 'LegalServices'