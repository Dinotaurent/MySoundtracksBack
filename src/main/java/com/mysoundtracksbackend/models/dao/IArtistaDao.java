/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mysoundtracksbackend.models.dao;

import com.mysoundtracksbackend.models.entity.Artista;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author danie
 */
public interface IArtistaDao extends CrudRepository<Artista, Long>{
    
}
