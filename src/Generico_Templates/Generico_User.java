//Acumular dados das pessoas em Formato de Pilha com Push que vai empurrado cada dados adicionados
package Generico_Templates;

import java.util.ArrayList;
/*
 * @author Ivandro
 */
public class Generico_User <T>  {
    
    private ArrayList<T> listausuarios = new ArrayList<>();
    
     Generico_User() {}
    
    void push(T d) {
        this.listausuarios.add(d);
    }
    
    T pop() {
        int i = this.listausuarios.size()-1;
        if (i>=0)
            return this.listausuarios.remove(i);
        return null;
    }
}
