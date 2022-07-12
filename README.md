
 ## Despliegue de apps Spring Boot en Heroku

Crear archivo `system.properties` en el proyecto con el contenido:

```java.runtime.version=8
```


1. Crear cuenta en heroku.com y github.com
2. Tener configurado git en el ordenador
    1. `git config --global user.name "Tu nombre"`
    2. `git config --global user.email "Tu correo"`
3. Subir el proyecto a github desde IntelliJ IDEA en la opcion: VCS > Share pojects on Github
4. Desde Heroku, crear una app y elegir metodo Github y buscar el repositorio subido
5. Habilitar deploy automatico en las opciones de configuracion y ejecutar el deploy