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
import types.Disk;

/**
 * Manages the collection of disks available inside an storage domain that is attached to a data center.
 *
 * @author Juan Hernandez <juan.hernandez@redhat.com>
 * @date 4 Jan 2017
 * @status added
 */
@Service
@Area("Storage")
public interface AttachedStorageDomainDisksService {
    /**
     * Adds or registers a disk.
     *
     * IMPORTANT: Since version 4.2 of the engine this operation is deprecated, and preserved only for backwards
     * compatibility. It will be removed in the future. To add a new disk use the xref:services/disks/methods/add[add]
     * operation of the service that manages the disks of the system. To register an unregistered disk use the
     * xref:services/attached_storage_domain_disk/methods/register[register] operation of the service that manages
     * that disk.
     *
     * @author Juan Hernandez <juan.hernandez@redhat.com>
     * @date 14 Sep 2016
     * @status added
     * @deprecated 4.2
     */
    @Deprecated
    interface Add {
        /**
         * The disk to add or register.
         *
         * @author Juan Hernandez <juan.hernandez@redhat.com>
         * @date 4 Jan 2017
         * @status added
         */
        @In @Out Disk disk();

        /**
         * Indicates if a new disk should be added or if an existing unregistered disk should be registered. If the
         * value is `true` then the identifier of the disk to register needs to be provided. For example, to register
         * the disk with id `456` send a request like this:
         *
         * ```http
         * POST /ovirt-engine/api/storagedomains/123/disks?unregistered=true
         * ```
         *
         * With a request body like this:
         *
         * ```xml
         * <disk id="456"/>
         * ```
         *
         * If the value is `false` then a new disk will be created in the storage domain. In that case the
         * `provisioned_size`, `format` and `name` attributes are mandatory. For example, to create a new
         * _copy on write_ disk of 1 GiB, send a request like this:
         *
         * ```http
         * POST /ovirt-engine/api/storagedomains/123/disks
         * ```
         *
         * With a request body like this:
         *
         * ```xml
         * <disk>
         *   <name>mydisk</name>
         *   <format>cow</format>
         *   <provisioned_size>1073741824</provisioned_size>
         * </disk>
         * ```
         *
         * The default value is `false`.
         *
         * @author Juan Hernandez <juan.hernandez@redhat.com>
         * @date 4 Jan 2017
         * @status added
         */
        @In Boolean unregistered();
    }

    /**
     * Retrieve the list of disks that are available in the storage domain.
     *
     * @author Juan Hernandez <juan.hernandez@redhat.com>
     * @date 4 Jan 2017
     * @status added
     */
    interface List extends Follow {
        /**
         * List of retrieved disks.
         *
         * The order of the returned disks isn't guaranteed.
         *
         * @author Juan Hernandez <juan.hernandez@redhat.com>
         * @date 4 Jan 2017
         * @status added
         */
        @Out Disk[] disks();

        /**
         * Sets the maximum number of disks to return. If not specified all the disks are returned.
         *
         * @author Juan Hernandez <juan.hernandez@redhat.com>
         * @date 4 Jan 2017
         * @status added
         */
        @In Integer max();
    }

    /**
     * Reference to the service that manages a specific disk.
     *
     * @author Juan Hernandez <juan.hernandez@redhat.com>
     * @date 4 Jan 2017
     * @status added
     */
    @Service AttachedStorageDomainDiskService disk(String id);
}
