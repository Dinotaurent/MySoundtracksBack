/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mysoundtracksbackend.models.services;

import com.mysoundtracksbackend.models.dao.IArtistaDao;
import com.mysoundtracksbackend.models.entity.Artista;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author danie
 */
@Service
public class ArtistaServiceImpl implements IArtistaService {

    @Autowired
    private IArtistaDao artistaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Artista> findAll() {
        return (List<Artista>) artistaDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Artista findById(Long id) {
        return artistaDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Artista save(Artista artista) {
        return artistaDao.save(artista);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        artistaDao.deleteById(id);
    }

}
