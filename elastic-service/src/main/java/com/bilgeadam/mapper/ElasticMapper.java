package com.bilgeadam.mapper;

import com.bilgeadam.rabbitmq.model.RegisterElasticModel;
import com.bilgeadam.repository.entity.UserProfile;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ElasticMapper {
    ElasticMapper INSTANCE = Mappers.getMapper(ElasticMapper.class);

    UserProfile fromRegisterElasticModelToUserProfile(RegisterElasticModel model);
}
