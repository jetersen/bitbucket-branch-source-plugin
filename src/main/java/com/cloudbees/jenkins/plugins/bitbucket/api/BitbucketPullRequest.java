/*
 * The MIT License
 *
 * Copyright (c) 2016, CloudBees, Inc.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.cloudbees.jenkins.plugins.bitbucket.api;

import edu.umd.cs.findbugs.annotations.NonNull;

/**
 * Represents a pull request in Bitbucket.
 * Only the source repository is necessary, the destination repo is inferred.
 */
public interface BitbucketPullRequest {

    /**
     * @return the source repository of this pull request
     */
    BitbucketPullRequestSource getSource();

    /**
     * @return the target repository of this pull request
     */
    BitbucketPullRequestDestination getDestination();

    /**
     * @return pull request ID as provided by Bitbucket. It can be used for notifications.
     */
    @NonNull
    String getId();

    String getTitle();

    String getLink();

    String getAuthorLogin();

    String getAuthorEmail();

}
