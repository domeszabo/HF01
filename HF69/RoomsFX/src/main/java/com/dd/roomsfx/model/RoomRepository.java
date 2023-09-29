package com.dd.roomsfx.model;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface RoomRepository extends CrudRepository<Room, Integer>
{
    List<Room> findByOpen(boolean open);
    
    List<Room> findByClassificationOrderByNameAsc(char classification);
    
    List<Room> findByClassificationOrderByClassificationDesc(char classification);
    
    List<Room> findBySectorId(Long sectorId);
    
    List<Room> findBySectorAccessLevelLessThanEqual(int accessLevel);
    
    List<Room> findByOpenAndClassification(boolean open, char classification);
}
