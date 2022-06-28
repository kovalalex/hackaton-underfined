package com.cbr.hackaton.resolver;

import com.cbr.hackaton.entity.Record;
import com.cbr.hackaton.repository.RecordRepository;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class QueryResolver implements GraphQLQueryResolver {
    @Autowired
    private RecordRepository recordRepository;

    public boolean todo() {
        return false;
    }

    public List<Record> getRecords() {
       return recordRepository.findAll();
    }
}
