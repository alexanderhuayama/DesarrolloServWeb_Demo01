
package com.service.ws.jaxws;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.service.bean.Jugador;

@XmlRootElement(name = "obtenerJugadoresResponse", namespace = "http://ws.service.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerJugadoresResponse", namespace = "http://ws.service.com/")
public class ObtenerJugadoresResponse {

    @XmlElement(name = "return", namespace = "")
    private List<Jugador> _return;

    /**
     * 
     * @return
     *     returns List<Jugador>
     */
    public List<Jugador> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(List<Jugador> _return) {
        this._return = _return;
    }

}
