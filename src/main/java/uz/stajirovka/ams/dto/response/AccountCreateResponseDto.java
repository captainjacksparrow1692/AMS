package uz.stajirovka.ams.dto.response;

import lombok.Builder;
import uz.stajirovka.ams.constant.enums.AccountStatus;
import uz.stajirovka.ams.constant.enums.AccountCurrency;

import java.time.LocalDateTime;

@Builder
public record AccountCreateResponseDto(

    Long accountNumber,

    AccountStatus accountStatus,

    AccountCurrency accountCurrency,

    Long balance,

    LocalDateTime createdAt
) {
}
