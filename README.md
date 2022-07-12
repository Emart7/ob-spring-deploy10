
 ## Despliegue de apps Spring Boot en Heroku

Crear archivo `system.properties` en el proyecto con el contenido:

```java.runtime.version=8.0.0```

1. Crear cuenta en heroku.com y github.com
2. Tener configurado git en el ordenador (ejecutar unicacmente la primera vez que se instala git)
    1. `git config --global user.name "Tu nombre"`
    2. `git config --global user.email "Tu correo"`
3. Subir el proyecto a github desde IntelliJ IDEA en la opcion: VCS > Share pojects on Github
4. Desde Heroku, crear una app y elegir metodo Github y buscar el repositorio subido
5. Habilitar deploy automatico en las opciones de configuracion y ejecutar el deploy

## COMPLEMENTO 1

*Probar empaquetar la aplicacion con maven packeg desde Intellij IDE

*Verificar la variables de entorno del sistema

*Desde la terminal en Intellij IDEA verificar que se ejecuta correctamente con el comando:
```java -jar target/spring-deploy10-1.0.jar```

*Crear un perfil para dev y otro para test con una propiedad nueva que carguemos en el controlador

## COMPLEMENTO 2

Desplegar el API REST de Laptops en Heroku y verificar el funcionamiento desde Postman

## PROVEEDORES CLOUD
*Heroku
*Netlify
*Vercel
