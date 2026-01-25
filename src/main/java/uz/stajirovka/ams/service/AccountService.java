package uz.stajirovka.ams.service;

import uz.stajirovka.ams.dto.request.AccountCreateRequestDto;
import uz.stajirovka.ams.dto.response.AccountCreateResponseDto;
import uz.stajirovka.ams.dto.response.AccountInfoResponseDto;
import uz.stajirovka.ams.dto.response.BalanceResponseDto;

public interface AccountService {

    AccountCreateResponseDto createAccount(AccountCreateRequestDto requestDto);

    AccountInfoResponseDto getAccountInfo(Long accountNumber);

    BalanceResponseDto getBalance(Long accountNumber);

    AccountInfoResponseDto blockAccount(Long accountNumber);

    AccountInfoResponseDto closeAccount(Long accountNumber);
}
