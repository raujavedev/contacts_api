# API REST de Gestión de Contactos

Esta es una API REST básica para la gestión de contactos, diseñada para pruebas y uso con herramientas como [Postman](https://www.postman.com/) y otras similares. La API está implementada utilizando **Spring Boot** y **MySQL**, proporcionando operaciones CRUD para manejar contactos.

## Características

- **CRUD completo**: Permite crear, leer, actualizar y eliminar contactos.
- **Base de datos MySQL**: Utiliza MySQL para almacenar la información de los contactos.
- **Campos de contacto**:
  - `Id`: Identificador único del contacto (autogenerado).
  - `FirstName`: Nombre del contacto.
  - `LastName`: Apellido del contacto.
  - `Email`: correo electrónico del contacto.
  - `Phone`: Número de teléfono del contacto.
  - `CreatedAt`: Fecha de creación del contacto (generada automáticamente).
  - `UpdatedAt`: Fecha de última actualización del contacto (generada automáticamente).

## Endpoints

La API incluye los siguientes endpoints:

- `GET /contacts`: Obtener todos los contactos.
- `GET /contacts/{id}`: Obtener un contacto por su ID.
- `POST /contacts`: Crear un nuevo contacto.
- `PUT /contacts/{id}`: Actualizar un contacto existente.
- `DELETE /contacts/{id}`: Eliminar un contacto.

### Ejemplo de solicitud para registrar o actualizar un contacto

Para **registrar** o **actualizar** un contacto, puedes enviar una solicitud `POST` (para crear) o `PUT` (para actualizar) con el siguiente cuerpo en formato JSON:

```json
{
  "firstName": "FirstName",
  "lastName": "LastName",
  "email": "email@example.com",
  "phone": "phoneNumber"
}
```
## Tecnologías

- **Spring Boot**: Framework principal para el desarrollo de la API.
- **MySQL**: Base de datos relacional utilizada para almacenar los contactos.
- **JPA/Hibernate**: Para la gestión de la persistencia de los datos.

## Instalación

1. Clona el repositorio:
   ```bash
   git clone https://github.com/raujavedev/contacts_api.git
2. Configura la conexión a la base de datos en el archivo `application.properties`
   ```properties
   spring.datasource.url=${DB_URL}
   spring.datasource.username=${DB_USERNAME}
   spring.datasource.password=${DB_PASSWORD}

