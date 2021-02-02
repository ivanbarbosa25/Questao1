
package Generico_Templates;

/*
 * @author Ivandro
 */
public class TestUser {
    
    //Main
    public static void main(String[] args) {
        
        //Adicionando Usuarios o ultimo nome adicionado sempre vai para cima
        Generico_User<User> user = new Generico_User<>();
        user.push(new User("Ivandro", 26, "Guiné Bissau","Bissau"));
        user.push(new User("Cirlei", 28, "Brasil","Rondonopolis"));
        user.push(new User("Badji", 39, "Senegal","Dakar"));
        user.push(new User("Sandra", 56, "Portugal","Lisboa"));
        User save;
        while ((save=user.pop())!= null) {
            System.out.println("Usuarios: " + save);
        } 
    }
    
}
