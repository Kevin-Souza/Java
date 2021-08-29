/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kevin
 */
public class TesteMedico {
        public static void main (String[] args){
        System.out.println("========= Medico 1");    
        Medico m1 = new Medico();
        m1.setNome("Doutor Chapatin");
        m1.setIdade(100);
        m1.setSexo("Masculino");
        m1.setAltura(1.60f);
        m1.setPeso(90f);
        m1.setRg("11.111.111-1");
        m1.setCRM("00001/sp");
        
        // Usar métodos do objeto P1
        m1.imprimir();
        m1.falar();
        m1.prescrever();
        m1.andar();
        m1.Examinar();
    }
}
