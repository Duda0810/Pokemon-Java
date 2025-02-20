/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Pokemon;


/**
 *
 * @author MARIAEDUARDACOSTABAT
 */
public interface Pokemon {   
     String getNome();
    String getTipo();
    int getNivel();
    Object[] toArray();
}
    
    @Override
public String toString() {
    return nome + " (" + tipo + ", Nível: " + nivel + ")";
}



