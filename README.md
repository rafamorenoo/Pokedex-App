# Pokedex App

## 🚀 Tecnologías usadas
- **Backend:** Java 23, Spring Boot 3, RestTemplate, Maven  
- **Frontend:** HTML5, CSS3, JavaScript (Vanilla JS)  
- **API externa:** PokeAPI  
- **Control de versiones:** Git y GitHub  

## 📋 Características
- Buscar Pokémon por ID o nombre (case-insensitive).  
- Mostrar imagen, tipos, altura y peso.  
- Manejo de errores con mensajes claros (ejemplo: Pokémon no encontrado).  
- Soporte CORS para permitir conexión frontend-backend en diferentes puertos.  
- Interfaz limpia y profesional con modo claro/oscuro toggle.  

## 🛠️ Cómo ejecutar

### Backend
1. Clonar el repositorio  
2. Navegar a la carpeta del backend  
3. Ejecutar:  
./mvnw spring-boot:run
El backend correrá en http://localhost:8080

### Frontend


Servir el html con un servidor HTTP (por ejemplo, con http-server):
npx http-server -p 3000
Abrir en navegador http://localhost:3000

🔧 Endpoints API
GET /api/pokemon/{id} - Buscar Pokémon por ID

GET /api/pokemon/name/{name} - Buscar Pokémon por nombre

🧑‍💻 Autor
Rafa Moreno
