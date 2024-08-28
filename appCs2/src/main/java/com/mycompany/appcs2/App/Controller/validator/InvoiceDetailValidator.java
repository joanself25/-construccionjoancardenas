/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.appcs2.App.Controller.validator;

/**
 *
 * @author CLAUDIA
 */
public class InvoiceDetailValidator extends CommonsValidator {

    public InvoiceDetailValidator() {

        super();
    }

    public long validId(String id) throws Exception {

        return super.isValidlong("id de la factura detallada ", id);
    }

    public int validNumItems(String item) throws Exception {
        return super.isValidinteger("numero de la factura detallada ", item);
    }

    public void validDescripcion(String descripcion) throws Exception {
        super.isValidString("descripcion items de la factura", descripcion);
    }

    public long validValueItems(String value) throws Exception {
        return super.isValidlong("  valor de los items ", value);

    }

    public double validAmount(String amount) throws Exception {
        return super.isValidDouble("el monto de la factura ", amount);
    }

}
