package uz.stajirovka.ams.dto.response;

import lombok.Builder;
import uz.stajirovka.ams.constant.enums.AccountCurrency;
import uz.stajirovka.ams.constant.enums.AccountStatus;

import java.time.LocalDateTime;

@Builder
public record AccountInfoResponseDto(

    Long accountNumber,

    AccountStatus accountStatus,

    AccountCurrency accountCurrency,

    Long balance,

    LocalDateTime createdAt,

    LocalDateTime updatedAt
) {
}
