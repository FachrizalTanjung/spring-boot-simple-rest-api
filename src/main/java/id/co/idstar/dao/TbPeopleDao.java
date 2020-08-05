package id.co.idstar.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import id.co.idstar.model.TbPeople;

@Repository
public interface TbPeopleDao extends JpaRepository<TbPeople, Integer> {

}
