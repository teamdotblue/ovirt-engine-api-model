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

import annotations.Area;
import mixins.Follow;
import org.ovirt.api.metamodel.annotations.In;
import org.ovirt.api.metamodel.annotations.Out;
import org.ovirt.api.metamodel.annotations.Service;
import types.Role;

/**
 * Represents a roles sub-collection, for example scoped by user.
 */
@Service
@Area("Infrastructure")
public interface AssignedRolesService {
    /**
     * Returns the roles assigned to the permission.
     *
     * The order of the returned roles isn't guaranteed.
     *
     * @author Juan Hernandez <juan.hernandez@redhat.com>
     * @date 15 Apr 2017
     * @status added
     */
    interface List extends Follow {
        @Out Role[] roles();

        /**
         * Sets the maximum number of roles to return. If not specified all the roles are returned.
         */
        @In Integer max();
    }

    /**
     * Sub-resource locator method, returns individual role resource on which the remainder of the URI is dispatched.
     */
    @Service RoleService role(String id);
}
