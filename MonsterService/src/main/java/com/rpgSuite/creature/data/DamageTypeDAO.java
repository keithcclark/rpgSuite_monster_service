package com.rpgSuite.creature.data;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.rpgSuite.creature.beans.DamageType;

@Component
public interface DamageTypeDAO extends CrudRepository<DamageType, Integer> {
	Set<DamageType> findAll();
}
