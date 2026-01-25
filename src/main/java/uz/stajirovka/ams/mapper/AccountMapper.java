package uz.stajirovka.ams.mapper;

import org.mapstruct.Mapper;
import uz.stajirovka.ams.dto.request.AccountCreateRequestDto;
import uz.stajirovka.ams.dto.response.AccountCreateResponseDto;
import uz.stajirovka.ams.dto.response.AccountInfoResponseDto;
import uz.stajirovka.ams.dto.response.BalanceResponseDto;
import uz.stajirovka.ams.entity.AccountEntity;

import static org.mapstruct.ReportingPolicy.WARN;

@Mapper(componentModel = "spring",
    unmappedTargetPolicy = WARN,
    unmappedSourcePolicy = WARN)
public interface AccountMapper {

    AccountEntity toEntity(AccountCreateRequestDto requestDto);

    AccountCreateResponseDto toCreateResponse(AccountEntity entity);

    AccountInfoResponseDto toAccountInfoResponse(AccountEntity entity);

    BalanceResponseDto toBalanceResponse(AccountEntity entity);
}
