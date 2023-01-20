/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nila.dao;

import Nila.model.Anggota;
import java.util.List;
import java.util.ArrayList;


/**
 *
 * @author Nila Enjeni
 */
public class AnggotaDaoImpl implements AnggotaDao {
  List<Anggota> data = new ArrayList <>();

    public AnggotaDaoImpl() {
        data.add(new Anggota("2101091001","Nila Enjeli","Pariaman"));
        data.add(new Anggota("2101091008","Salsabila","Padang"));
        data.add(new Anggota("2101091007","Rahmitul Hasanah","Pesisir Selatan"));
    }
    
    
    @Override
    public Anggota save(Anggota anggota){
        data.add(anggota);
        return anggota;
    }
    
    public  Anggota update(int index,Anggota anggota ){
        data.set(index , anggota);
        return anggota;
    }
    
    public Anggota delete(int index){
        return data.remove(index);
    }
    
    public Anggota getAnggota(int index){
         return data.get(index);
    }
    
    public  List<Anggota> getAllAnggota(){
        return data;
    }
  
}
