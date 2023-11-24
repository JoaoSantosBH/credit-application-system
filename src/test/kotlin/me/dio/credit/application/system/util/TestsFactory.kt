package me.dio.credit.application.system.util

import me.dio.credit.application.system.dto.request.CreditDto
import me.dio.credit.application.system.dto.request.CustomerDto
import me.dio.credit.application.system.dto.request.CustomerUpdateDto
import me.dio.credit.application.system.dto.response.CreditViewList
import me.dio.credit.application.system.entity.Address
import me.dio.credit.application.system.entity.Credit
import me.dio.credit.application.system.entity.Customer
import java.math.BigDecimal
import java.time.LocalDate
import java.util.*

fun buildCredit(
        creditValue: BigDecimal = BigDecimal.valueOf(100.0),
        dayFirstInstallment: LocalDate = LocalDate.now().plusMonths(2L),
        numberOfInstallments: Int = 15,
        customer: Customer = buildCustomer()
    ): Credit = Credit(
        creditValue = creditValue,
        dayFirstInstallment = dayFirstInstallment,
        numberOfInstallments = numberOfInstallments,
        customer = customer
    )

    fun buildCustomer(
        firstName: String = "Cami",
        lastName: String = "Cavalcante",
        cpf: String = "28475934625",
        email: String = "camila@gmail.com",
        password: String = "12345",
        zipCode: String = "12345",
        street: String = "Rua da Cami",
        income: BigDecimal = BigDecimal.valueOf(1000.0),
        id: Long = 1L
    ) = Customer(
        firstName = firstName,
        lastName = lastName,
        cpf = cpf,
        email = email,
        password = password,
        address = Address(
            zipCode = zipCode,
            street = street,
        ),
        income = income,
        id = id
    )


 fun builderCustomerDto(
    firstName: String = "Cami",
    lastName: String = "Cavalcante",
    cpf: String = "28475934625",
    email: String = "camila@email.com",
    income: BigDecimal = BigDecimal.valueOf(1000.0),
    password: String = "1234",
    zipCode: String = "000000",
    street: String = "Rua da Cami, 123",
) = CustomerDto(
    firstName = firstName,
    lastName = lastName,
    cpf = cpf,
    email = email,
    income = income,
    password = password,
    zipCode = zipCode,
    street = street
)

 fun builderCustomerUpdateDto(
    firstName: String = "CamiUpdate",
    lastName: String = "CavalcanteUpdate",
    income: BigDecimal = BigDecimal.valueOf(5000.0),
    zipCode: String = "45656",
    street: String = "Rua Updated"
): CustomerUpdateDto = CustomerUpdateDto(
    firstName = firstName,
    lastName = lastName,
    income = income,
    zipCode = zipCode,
    street = street
)

fun builderCreditDto(
    creditValue: BigDecimal = BigDecimal.valueOf(1500),
    dayFirstOfInstallment : LocalDate = LocalDate.now().plusMonths(2),
    numberOfInstallments : Int = 2,
    customerId : Long = 1L
) : CreditDto = CreditDto(
    creditValue = creditValue,
    dayFirstOfInstallment = dayFirstOfInstallment,
    numberOfInstallments = numberOfInstallments,
    customerId = customerId
)
 fun buildCreditsResponseList() : List<CreditViewList> =
     listOf(
         CreditViewList(
             creditCode = FAKE_UUID,
             creditValue = BigDecimal.valueOf(1212),
             numberOfInstallments = 12
         )
     )
val FAKE_UUID : UUID = UUID.fromString("2d5e0b92-e1c8-434a-857c-801862fcfc31")

