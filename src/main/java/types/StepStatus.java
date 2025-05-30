/*
The oVirt Project - oVirt Engine Api Model

Copyright oVirt Authors

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

  https://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

A copy of the Apache License, Version 2.0 is included with the program
in the file ASL2.
*/

package types;

import org.ovirt.api.metamodel.annotations.Type;

/**
 * Represents the status of the step.
 *
 * @author Moti Asayag <masayag@redhat.com>
 * @date 12 Dec 2016
 * @status added
 */
@Type
public enum StepStatus {

    /**
     * The aborted step status.
     * This status is applicable for an external step that was forcibly aborted.
     *
     * @author Moti Asayag <masayag@redhat.com>
     * @date 12 Dec 2016
     * @status added
     */
    ABORTED,

    /**
     * The failed step status.
     *
     * @author Moti Asayag <masayag@redhat.com>
     * @date 12 Dec 2016
     * @status added
     */
    FAILED,

    /**
     * The finished step status.
     * This status describes a completed step execution.
     *
     * @author Moti Asayag <masayag@redhat.com>
     * @date 12 Dec 2016
     * @status added
     */
    FINISHED,

    /**
     * The started step status.
     * This status represents a step which is currently being executed.
     *
     * @author Moti Asayag <masayag@redhat.com>
     * @date 12 Dec 2016
     * @status added
     */
    STARTED,

    /**
     * The unknown step status.
     * This status represents steps which their resolution is not known, i.e. steps that were executed before
     * the system was unexpectedly restarted.
     *
     * @author Moti Asayag <masayag@redhat.com>
     * @date 12 Dec 2016
     * @status added
     */
    UNKNOWN;
}