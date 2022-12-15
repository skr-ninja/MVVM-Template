package com.skrninja.usecase.errors

import com.skrninja.data.error.Error
import com.skrninja.data.error.mapper.ErrorMapper
import javax.inject.Inject

/**
 * Created by Sunil
 */

class ErrorManager @Inject constructor(private val errorMapper: ErrorMapper) : ErrorUseCase {
    override fun getError(errorCode: Int): Error {
        return Error(code = errorCode, description = errorMapper.errorsMap.getValue(errorCode))
    }
}
