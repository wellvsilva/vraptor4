/***
 * Copyright (c) 2009 Caelum - www.caelum.com.br/opensource
 * All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package br.com.caelum.vraptor.interceptor.multipart;

import br.com.caelum.vraptor.InterceptionException;
import br.com.caelum.vraptor.Lazy;
import br.com.caelum.vraptor.core.InterceptorStack;
import br.com.caelum.vraptor4.controller.ControllerMethod;

/**
 * A null implementation of {@link MultipartInterceptor}. This class does nothing.
 *
 * @author Otávio Scherer Garcia
 * @since 3.1.3
 * @see CommonsUploadMultipartInterceptor
 */
@Lazy
public class NullMultipartInterceptor implements MultipartInterceptor {

    /**
     * Never accepts.
     */
    public boolean accepts(ControllerMethod method) {
        return false;
    }

    public void intercept(InterceptorStack stack, ControllerMethod method, Object resourceInstance)
        throws InterceptionException {
        throw new UnsupportedOperationException();
    }
}