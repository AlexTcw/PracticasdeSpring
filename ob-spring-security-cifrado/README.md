
##CIFRADO

es el proceso de codificar la informacion de su representacion original (texto plano)
a texto cifrado, de manera que solamente pueda ser descifrado utilizando su clave.

HISTORIA DE CIFRADO:

1. Almacenar contraseñas en texto plano 
2. Almacenar contraseñas cifradas con una funcion hash
3. Almacenar contraseñas cifradas con una funcion hash + salt
4. Almacenar contraseñas cifradas con una funcion adaptativa + factor de trabajo

La seguridad se gana haciendo que la validacion de contraseñas sea costosa computacionalmente

##Algoritmos en SPRING SECURITY 

*BCrypt
*PBKF2
*scrypt
*argon2