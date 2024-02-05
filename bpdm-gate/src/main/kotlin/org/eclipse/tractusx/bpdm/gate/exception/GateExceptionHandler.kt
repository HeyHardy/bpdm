/*******************************************************************************
 * Copyright (c) 2021,2023 Contributors to the Eclipse Foundation
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Apache License, Version 2.0 which is available at
 * https://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 ******************************************************************************/

package org.eclipse.tractusx.bpdm.gate.exception

import org.eclipse.tractusx.bpdm.common.exception.BpdmExceptionHandler
import org.springframework.web.bind.annotation.ControllerAdvice

@ControllerAdvice
class GateExceptionHandler : BpdmExceptionHandler() {
//    override fun resolveException(
//        request: HttpServletRequest,
//        response: HttpServletResponse,
//        handler: Any?,
//        ex: Exception
//    ): ModelAndView? {
//        if (ex is HttpMessageNotReadableException) {
//            val errorMessage = "Invalid JSON request. Please check your request payload."
//            val responseBody = ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMessage)
//            response.status = HttpStatus.BAD_REQUEST.value()
//            response.writer.write(responseBody.toString())
//            return ModelAndView()
//        }
//        // Handle other exceptions as needed
//        return null
//    }
}