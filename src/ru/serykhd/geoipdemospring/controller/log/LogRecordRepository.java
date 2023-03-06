package ru.serykhd.geoipdemospring.controller.log;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

public interface LogRecordRepository extends CrudRepository<LogRecord, Long> {
}
