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

package services;

import mixins.Follow;
import org.ovirt.api.metamodel.annotations.Out;
import org.ovirt.api.metamodel.annotations.Service;
import types.AffinityLabel;

/**
 * This service represents one label to entity assignment
 * when accessed using the entities/affinitylabels subcollection.
 */
@Service
public interface AssignedAffinityLabelService {
    /**
     * Retrieves details about the attached label.
     */
    interface Get extends Follow {
        @Out AffinityLabel label();
    }

    /**
     * Removes the label from an entity. Does not touch the label itself.
     */
    interface Remove {
    }
}
