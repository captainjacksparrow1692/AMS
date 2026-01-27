package uz.stajirovka.ams.dto.response;

import lombok.Builder;
import uz.stajirovka.ams.constant.enums.enums.AccountCurrency;
import uz.stajirovka.ams.constant.enums.enums.AccountStatus;
import uz.stajirovka.ams.constant.enums.enums.AccountType;

import java.time.LocalDateTime;

@Builder
public record AccountCreateResponseDto(

    Long accountNumber,

    AccountStatus accountStatus,

    AccountCurrency accountCurrency,

    AccountType accountType,

    Long balance,

    LocalDateTime createdAt
) {
}
