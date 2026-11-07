# Examen Final - Programación II

Proyecto completo con **Backend Spring Boot**, **Frontend React + TypeScript** y la base de datos **MySQL finalB**.

## Estructura

- `backend/` - API REST Spring Boot.
- `frontend/` - React + TypeScript (Vite), página `/reportes`.
- `database/finalB_ferreteria.sql` - script de la base de datos y datos de prueba.

## 1. Base de datos

Ejecutar `database/finalB_ferreteria.sql` en MySQL Workbench.

La aplicación espera MySQL en `localhost:3306` y la base `finalB`.

## 2. Backend

Editar `backend/src/main/resources/application.properties` y reemplazar `SU_CONTRASEÑA` por la contraseña local de MySQL.

En PowerShell:

```powershell
cd backend
.\mvnw.cmd spring-boot:run
```

Backend: `http://localhost:8080`

Endpoints principales:

- `GET /articulos/mostrarActivosFiltro?nombre=`
- `GET /articulos/reporteArticuloCategoria`
- `GET /clientes/reporteClienteFactura`
- `GET /clientes/reporteClienteFacturaDetalle`

## 3. Frontend

En otra terminal:

```powershell
cd frontend
npm install
npm run dev
```

Abrir: `http://localhost:5173/reportes`

La pantalla contiene los cuatro reportes y exportación a PDF y Excel.

## GitHub

Las carpetas generadas (`node_modules`, `dist`, `target`) están excluidas mediante `.gitignore` y no deben subirse al repositorio.
