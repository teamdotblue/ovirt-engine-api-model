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
 * Describes the virtual functions configuration of an SR-IOV-enabled physical function NIC.
 *
 * @author Tahlia Richardson <trichard@redhat.com>
 * @date 31 Oct 2016
 * @status updated_by_docs
 */
@Type
public interface HostNicVirtualFunctionsConfiguration {
    /**
     * The maximum number of virtual functions the NIC supports. This property is read-only.
     *
     * @author Tahlia Richardson <trichard@redhat.com>
     * @date 31 Oct 2016
     * @status updated_by_docs
     */
    Integer maxNumberOfVirtualFunctions();

    /**
     * The number of virtual functions currently defined. A user-defined value between 0 and
     * `max_number_of_virtual_functions`.
     *
     * @author Tahlia Richardson <trichard@redhat.com>
     * @date 31 Oct 2016
     * @status updated_by_docs
     */
    Integer numberOfVirtualFunctions();

    /**
     * Defines whether all networks are allowed to be defined on the related virtual functions, or specified ones only.
     *
     * @author Tahlia Richardson <trichard@redhat.com>
     * @date 31 Oct 2016
     * @status updated_by_docs
     */
    Boolean allNetworksAllowed();
}
