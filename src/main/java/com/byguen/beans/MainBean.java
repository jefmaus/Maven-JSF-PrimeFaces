package com.byguen.beans;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author BYGUEN
 */
@Named(value = "mainBean")
@SessionScoped
public class MainBean implements Serializable {
    
    private String mensaje;

    /**
     * Creates a new instance of MainBean
     */
    public MainBean() {
    }
    
    
    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    
}
