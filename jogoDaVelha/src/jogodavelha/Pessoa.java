/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodavelha;

/**
 *
 * @author 2830482411022
 */
public class Pessoa {
    public String nome;
    public char sexo;
    public String idioma;
    
    
    public Pessoa(String nome, char sexo, String idioma){
        this.nome = nome;
        this.sexo = sexo;
        this.idioma = idioma;
    }
    
    public Object[] ObterDados(){
        return new Object[]{nome, sexo, idioma};
    }
}
