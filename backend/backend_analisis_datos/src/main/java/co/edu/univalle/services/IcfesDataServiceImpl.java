package co.edu.univalle.services;

import co.edu.univalle.database.entities.IcfesData;
import co.edu.univalle.database.repositories.IcfesDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class IcfesDataServiceImpl implements IcfesDataService {
    @Autowired
    private IcfesDataRepository icfesDataRepository;

    @Override
    public IcfesData findById(String id) {
        return icfesDataRepository.findById(id).orElse(null);
    }

    @Override
    public List<IcfesData> findByPeriodo(Integer periodo) {
        return icfesDataRepository.findByPeriodo(periodo).orElse(Collections.emptyList());
    }

    @Override
    public List<IcfesData> findByAll() {
        return icfesDataRepository.findAll();
    }
}
