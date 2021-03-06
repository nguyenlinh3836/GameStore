package com.project.lpd.service;

import com.project.lpd.entity.NewsEntity;
import com.project.lpd.entity.ShipperEntity;
import com.project.lpd.repository.ShippeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.project.lpd.entity.ShipperEntity;
import com.project.lpd.repository.ShippeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShipperServiceImpl implements ShipperService{

    @Autowired
    ShippeRepo shippeRepo;
    @Override
    public ShipperEntity creatMember(ShipperEntity shipperEntity) {
        return shippeRepo.save(shipperEntity);
    }

    @Override
    public List<ShipperEntity> getAll() {
        return shippeRepo.findAll();
    }

    @Override
    public void deleteById(int id) {
        shippeRepo.deleteById(id);
    }

    @Override
    public Optional<ShipperEntity> find(int id) {
        return shippeRepo.findById(id);
    }

    @Override
    public List<ShipperEntity> findByNameShipper(String name) {
        return shippeRepo.findByName(name);
    }

    @Override
    public ShipperEntity getShipById(int id) {
        return shippeRepo.findById(id).get();
    }

    @Override
    public ShipperEntity updateShip(ShipperEntity s) {
        return shippeRepo.save(s);
    }


}