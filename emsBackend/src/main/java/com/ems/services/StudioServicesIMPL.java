package com.ems.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ems.dao.StudioDao;
import com.ems.pojos.Studio;

@Service
@Transactional
public class StudioServicesIMPL implements IStudioServices {

	@Autowired
	StudioDao studioDao;
	@Override
	public List<Studio> getAllStudio() {
		
		return studioDao.findAll();
	}

}