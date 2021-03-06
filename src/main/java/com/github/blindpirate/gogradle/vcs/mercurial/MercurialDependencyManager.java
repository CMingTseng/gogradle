/*
 * Copyright 2016-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *           http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.github.blindpirate.gogradle.vcs.mercurial;

import com.github.blindpirate.gogradle.core.cache.GlobalCacheManager;
import com.github.blindpirate.gogradle.core.cache.ProjectCacheManager;
import com.github.blindpirate.gogradle.vcs.GitMercurialAccessor;
import com.github.blindpirate.gogradle.vcs.GitMercurialDependencyManager;
import com.github.blindpirate.gogradle.vcs.VcsType;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class MercurialDependencyManager extends GitMercurialDependencyManager {

    private final HgClientAccessor accessor;

    @Inject
    public MercurialDependencyManager(HgClientAccessor accessor,
                                      GlobalCacheManager globalCacheManager,
                                      ProjectCacheManager projectCacheManager) {
        super(globalCacheManager, projectCacheManager);
        this.accessor = accessor;
    }

    @Override
    protected GitMercurialAccessor getAccessor() {
        return accessor;
    }

    @Override
    protected VcsType getVcsType() {
        return VcsType.MERCURIAL;
    }
}
