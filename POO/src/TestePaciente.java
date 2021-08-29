/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kevin
 */
public class TestePaciente {
    public static void main (String[] args){
        System.out.println("========= Paciente 1");    
        Paciente p1 = new Paciente();
        p1.setNome("Denys");
        p1.setIdade(19);
        p1.setSexo("Masculino");
        p1.setAltura(1.74f);
        p1.setPeso(88f);
        p1.setRg("11.111.111-1");
        p1.setNumcarteiraSUS("111 1111 1111 1111");
        
        // Usar métodos do objeto P1
        p1.imprimir();
        p1.falar();
        p1.irmedico();
        p1.andar();
        p1.tomarremedio();
        }
}

