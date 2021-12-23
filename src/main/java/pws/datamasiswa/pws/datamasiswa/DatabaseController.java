/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pws.datamasiswa.pws.datamasiswa;

import java.util.ArrayList;
import java.util.List;
import javax.xml.crypto.Data;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author ASUS
 */

@Controller
public class DatabaseController {
   @CrossOrigin
    @RequestMapping(value = "/mahasiswajson", produces = { MediaType.APPLICATION_JSON_VALUE,//MediaType.Text_XML_VALUE
    })
    @ResponseBody
    public List<Mahasiswa> getMahasiswajson(){
        
        List<Mahasiswa> mahasiswa = new ArrayList<>();
        
       MahasiswaJpaController controller = new MahasiswaJpaController();
        
        try{
            mahasiswa = controller.findMahasiswaEntities();
        } catch(Exception e){}
        
        return mahasiswa;
    }
    
    @RequestMapping("/mahasiswaxml")
    @ResponseBody
    public List<Mahasiswa> getMahasiswaxml(){
        
        List<Mahasiswa> mahasiswa = new ArrayList<>();
        
       MahasiswaJpaController controller = new MahasiswaJpaController();
        
        try{
            mahasiswa = controller.findMahasiswaEntities();
        } catch(Exception e){}
        return mahasiswa;
    }
}