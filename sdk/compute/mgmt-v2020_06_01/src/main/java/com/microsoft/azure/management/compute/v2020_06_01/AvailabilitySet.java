/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_06_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.compute.v2020_06_01.implementation.ComputeManager;
import java.util.List;
import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.compute.v2020_06_01.implementation.AvailabilitySetInner;

/**
 * Type representing AvailabilitySet.
 */
public interface AvailabilitySet extends HasInner<AvailabilitySetInner>, Resource, GroupableResourceCore<ComputeManager, AvailabilitySetInner>, HasResourceGroup, Refreshable<AvailabilitySet>, Updatable<AvailabilitySet.Update>, HasManager<ComputeManager> {
    /**
     * @return the platformFaultDomainCount value.
     */
    Integer platformFaultDomainCount();

    /**
     * @return the platformUpdateDomainCount value.
     */
    Integer platformUpdateDomainCount();

    /**
     * @return the proximityPlacementGroup value.
     */
    SubResource proximityPlacementGroup();

    /**
     * @return the sku value.
     */
    Sku sku();

    /**
     * @return the statuses value.
     */
    List<InstanceViewStatus> statuses();

    /**
     * @return the virtualMachines value.
     */
    List<SubResource> virtualMachines();

    /**
     * The entirety of the AvailabilitySet definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of AvailabilitySet definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a AvailabilitySet definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the AvailabilitySet definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the availabilityset definition allowing to specify PlatformFaultDomainCount.
         */
        interface WithPlatformFaultDomainCount {
            /**
             * Specifies platformFaultDomainCount.
             * @param platformFaultDomainCount Fault Domain count
             * @return the next definition stage
             */
            WithCreate withPlatformFaultDomainCount(Integer platformFaultDomainCount);
        }

        /**
         * The stage of the availabilityset definition allowing to specify PlatformUpdateDomainCount.
         */
        interface WithPlatformUpdateDomainCount {
            /**
             * Specifies platformUpdateDomainCount.
             * @param platformUpdateDomainCount Update Domain count
             * @return the next definition stage
             */
            WithCreate withPlatformUpdateDomainCount(Integer platformUpdateDomainCount);
        }

        /**
         * The stage of the availabilityset definition allowing to specify ProximityPlacementGroup.
         */
        interface WithProximityPlacementGroup {
            /**
             * Specifies proximityPlacementGroup.
             * @param proximityPlacementGroup Specifies information about the proximity placement group that the availability set should be assigned to. &lt;br&gt;&lt;br&gt;Minimum api-version: 2018-04-01
             * @return the next definition stage
             */
            WithCreate withProximityPlacementGroup(SubResource proximityPlacementGroup);
        }

        /**
         * The stage of the availabilityset definition allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             * @param sku Sku of the availability set, only name is required to be set. See AvailabilitySetSkuTypes for possible set of values. Use 'Aligned' for virtual machines with managed disks and 'Classic' for virtual machines with unmanaged disks. Default value is 'Classic'
             * @return the next definition stage
             */
            WithCreate withSku(Sku sku);
        }

        /**
         * The stage of the availabilityset definition allowing to specify VirtualMachines.
         */
        interface WithVirtualMachines {
            /**
             * Specifies virtualMachines.
             * @param virtualMachines A list of references to all virtual machines in the availability set
             * @return the next definition stage
             */
            WithCreate withVirtualMachines(List<SubResource> virtualMachines);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<AvailabilitySet>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithPlatformFaultDomainCount, DefinitionStages.WithPlatformUpdateDomainCount, DefinitionStages.WithProximityPlacementGroup, DefinitionStages.WithSku, DefinitionStages.WithVirtualMachines {
        }
    }
    /**
     * The template for a AvailabilitySet update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<AvailabilitySet>, Resource.UpdateWithTags<Update>, UpdateStages.WithPlatformFaultDomainCount, UpdateStages.WithPlatformUpdateDomainCount, UpdateStages.WithProximityPlacementGroup, UpdateStages.WithSku, UpdateStages.WithVirtualMachines {
    }

    /**
     * Grouping of AvailabilitySet update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the availabilityset update allowing to specify PlatformFaultDomainCount.
         */
        interface WithPlatformFaultDomainCount {
            /**
             * Specifies platformFaultDomainCount.
             * @param platformFaultDomainCount Fault Domain count
             * @return the next update stage
             */
            Update withPlatformFaultDomainCount(Integer platformFaultDomainCount);
        }

        /**
         * The stage of the availabilityset update allowing to specify PlatformUpdateDomainCount.
         */
        interface WithPlatformUpdateDomainCount {
            /**
             * Specifies platformUpdateDomainCount.
             * @param platformUpdateDomainCount Update Domain count
             * @return the next update stage
             */
            Update withPlatformUpdateDomainCount(Integer platformUpdateDomainCount);
        }

        /**
         * The stage of the availabilityset update allowing to specify ProximityPlacementGroup.
         */
        interface WithProximityPlacementGroup {
            /**
             * Specifies proximityPlacementGroup.
             * @param proximityPlacementGroup Specifies information about the proximity placement group that the availability set should be assigned to. &lt;br&gt;&lt;br&gt;Minimum api-version: 2018-04-01
             * @return the next update stage
             */
            Update withProximityPlacementGroup(SubResource proximityPlacementGroup);
        }

        /**
         * The stage of the availabilityset update allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             * @param sku Sku of the availability set
             * @return the next update stage
             */
            Update withSku(Sku sku);
        }

        /**
         * The stage of the availabilityset update allowing to specify VirtualMachines.
         */
        interface WithVirtualMachines {
            /**
             * Specifies virtualMachines.
             * @param virtualMachines A list of references to all virtual machines in the availability set
             * @return the next update stage
             */
            Update withVirtualMachines(List<SubResource> virtualMachines);
        }

    }
}
