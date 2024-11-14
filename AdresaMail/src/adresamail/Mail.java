/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adresamail;
import java.util.Date;
/**
 *
 * @author nh114
 */
public class Mail {

    AdresaMail adresaExpeditor;
    AdresaMail adresaDestinatar;
    String mesaj;
    Date data=new Date();
    
    Mail()
    {
        adresaExpeditor=new AdresaMail();
        adresaDestinatar=new AdresaMail();
        mesaj="<mail gol>";
    }
    Mail(AdresaMail adresaExpeditor, AdresaMail adresaDestinatar ,String mesaj)
    {
        this.adresaExpeditor=adresaExpeditor;
        this.adresaDestinatar= adresaDestinatar;
        this.mesaj=mesaj;
    }
    
    public String toString()
    {
        return "\nDe la: "+adresaExpeditor.denumire+" \tBusiness: "+adresaExpeditor.contBusiness+"\nCatre: "+adresaDestinatar.denumire+" \tBusiness: "+adresaDestinatar.contBusiness+"\n\n "+mesaj+"\n\nTrimis la data de: "+data.toString();
    }
}
