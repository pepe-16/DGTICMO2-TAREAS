/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto.Modulo2;

/**
 *
 * @author Pepe
 */
public class CreateInstrumentosNotariales extends Dialog {
    InstrumentosNotariales instrumento;
    
    @Override
    public void initialize(String operatingEnvironment) throws Exception {
        if (operatingEnvironment.equals("PoderNotarial")) {
            instrumento = new PoderNotarial();
        }
        else if (operatingEnvironment.equals("Protocolizacion")) {
            instrumento = new Protocolizacion();
        }
        else {
            throw new Exception("Unsupported operating environment.");
        }
    }
}
