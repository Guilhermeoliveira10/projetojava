package br.com.fiap.projetos_api.service.mapper;

import br.com.fiap.projetos_api.dto.CoverageDTO;
import br.com.fiap.projetos_api.dto.ClaimDTO;
import br.com.fiap.projetos_api.dto.InsuranceContractDTO;
import br.com.fiap.projetos_api.model.Coverage;
import br.com.fiap.projetos_api.model.Claim;
import br.com.fiap.projetos_api.model.InsuranceContract;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface InsuranceContractMapper {

    InsuranceContractMapper INSTANCE = Mappers.getMapper(InsuranceContractMapper.class);

    // Mapeamento entre InsuranceContract e InsuranceContractDTO
    InsuranceContractDTO toDTO(InsuranceContract contract);
    InsuranceContract toEntity(InsuranceContractDTO contractDTO);

    // Mapeamentos para Coverage
    Coverage toEntity(CoverageDTO coverageDTO);
    CoverageDTO toDTO(Coverage coverage);
    List<Coverage> coverageDTOsToEntities(List<CoverageDTO> coverageDTOs); // Renomeado
    List<CoverageDTO> entitiesToCoverageDTOs(List<Coverage> coverages); // Renomeado

    // Mapeamentos para Claim
    Claim toEntity(ClaimDTO claimDTO);
    ClaimDTO toDTO(Claim claim);
    List<Claim> claimDTOsToEntities(List<ClaimDTO> claimDTOs); // Renomeado
    List<ClaimDTO> entitiesToClaimDTOs(List<Claim> claims); // Renomeado
}
