// *** WARNING: this file was generated by pulumi-language-java. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetesingressnginx.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.core.v1.inputs.AffinityArgs;
import com.pulumi.kubernetes.core.v1.inputs.EnvVarArgs;
import com.pulumi.kubernetes.core.v1.inputs.PodSecurityContextArgs;
import com.pulumi.kubernetes.core.v1.inputs.ProbeArgs;
import com.pulumi.kubernetes.core.v1.inputs.ResourceRequirementsArgs;
import com.pulumi.kubernetes.core.v1.inputs.TolerationArgs;
import com.pulumi.kubernetes.core.v1.inputs.VolumeArgs;
import com.pulumi.kubernetes.core.v1.inputs.VolumeMountArgs;
import com.pulumi.kubernetesingressnginx.inputs.AutoscalingArgs;
import com.pulumi.kubernetesingressnginx.inputs.ControllerDefaultBackendServiceArgs;
import com.pulumi.kubernetesingressnginx.inputs.ControllerImageArgs;
import com.pulumi.kubernetesingressnginx.inputs.ControllerServiceAccountArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ControllerDefaultBackendArgs extends com.pulumi.resources.ResourceArgs {

    public static final ControllerDefaultBackendArgs Empty = new ControllerDefaultBackendArgs();

    @Import(name="affinity")
    private @Nullable Output<AffinityArgs> affinity;

    public Optional<Output<AffinityArgs>> affinity() {
        return Optional.ofNullable(this.affinity);
    }

    @Import(name="autoscaling")
    private @Nullable Output<AutoscalingArgs> autoscaling;

    public Optional<Output<AutoscalingArgs>> autoscaling() {
        return Optional.ofNullable(this.autoscaling);
    }

    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Use an existing PSP instead of creating one.
     * 
     */
    @Import(name="existingPsp")
    private @Nullable Output<String> existingPsp;

    /**
     * @return Use an existing PSP instead of creating one.
     * 
     */
    public Optional<Output<String>> existingPsp() {
        return Optional.ofNullable(this.existingPsp);
    }

    @Import(name="extraArgs")
    private @Nullable Output<Map<String,Map<String,String>>> extraArgs;

    public Optional<Output<Map<String,Map<String,String>>>> extraArgs() {
        return Optional.ofNullable(this.extraArgs);
    }

    @Import(name="extraEnvs")
    private @Nullable Output<List<EnvVarArgs>> extraEnvs;

    public Optional<Output<List<EnvVarArgs>>> extraEnvs() {
        return Optional.ofNullable(this.extraEnvs);
    }

    /**
     * Additional volumeMounts to the default backend container.  - name: copy-portal-skins    mountPath: /var/lib/lemonldap-ng/portal/skins
     * 
     */
    @Import(name="extraVolumeMounts")
    private @Nullable Output<List<VolumeMountArgs>> extraVolumeMounts;

    /**
     * @return Additional volumeMounts to the default backend container.  - name: copy-portal-skins    mountPath: /var/lib/lemonldap-ng/portal/skins
     * 
     */
    public Optional<Output<List<VolumeMountArgs>>> extraVolumeMounts() {
        return Optional.ofNullable(this.extraVolumeMounts);
    }

    /**
     * Additional volumes to the default backend pod.  - name: copy-portal-skins    emptyDir: {}
     * 
     */
    @Import(name="extraVolumes")
    private @Nullable Output<List<VolumeArgs>> extraVolumes;

    /**
     * @return Additional volumes to the default backend pod.  - name: copy-portal-skins    emptyDir: {}
     * 
     */
    public Optional<Output<List<VolumeArgs>>> extraVolumes() {
        return Optional.ofNullable(this.extraVolumes);
    }

    @Import(name="image")
    private @Nullable Output<ControllerImageArgs> image;

    public Optional<Output<ControllerImageArgs>> image() {
        return Optional.ofNullable(this.image);
    }

    /**
     * Liveness probe values for default backend. Ref: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#container-probes.
     * 
     */
    @Import(name="livenessProbe")
    private @Nullable Output<ProbeArgs> livenessProbe;

    /**
     * @return Liveness probe values for default backend. Ref: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#container-probes.
     * 
     */
    public Optional<Output<ProbeArgs>> livenessProbe() {
        return Optional.ofNullable(this.livenessProbe);
    }

    @Import(name="minAvailable")
    private @Nullable Output<Integer> minAvailable;

    public Optional<Output<Integer>> minAvailable() {
        return Optional.ofNullable(this.minAvailable);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Node labels for default backend pod assignment Ref: https://kubernetes.io/docs/user-guide/node-selection/.
     * 
     */
    @Import(name="nodeSelector")
    private @Nullable Output<Map<String,String>> nodeSelector;

    /**
     * @return Node labels for default backend pod assignment Ref: https://kubernetes.io/docs/user-guide/node-selection/.
     * 
     */
    public Optional<Output<Map<String,String>>> nodeSelector() {
        return Optional.ofNullable(this.nodeSelector);
    }

    /**
     * Annotations to be added to default backend pods.
     * 
     */
    @Import(name="podAnnotations")
    private @Nullable Output<Map<String,String>> podAnnotations;

    /**
     * @return Annotations to be added to default backend pods.
     * 
     */
    public Optional<Output<Map<String,String>>> podAnnotations() {
        return Optional.ofNullable(this.podAnnotations);
    }

    /**
     * labels to add to the pod container metadata
     * 
     */
    @Import(name="podLabels")
    private @Nullable Output<Map<String,String>> podLabels;

    /**
     * @return labels to add to the pod container metadata
     * 
     */
    public Optional<Output<Map<String,String>>> podLabels() {
        return Optional.ofNullable(this.podLabels);
    }

    /**
     * Security Context policies for controller pods. See https://kubernetes.io/docs/tasks/administer-cluster/sysctl-cluster/ for notes on enabling and using sysctls.
     * 
     */
    @Import(name="podSecurityContext")
    private @Nullable Output<PodSecurityContextArgs> podSecurityContext;

    /**
     * @return Security Context policies for controller pods. See https://kubernetes.io/docs/tasks/administer-cluster/sysctl-cluster/ for notes on enabling and using sysctls.
     * 
     */
    public Optional<Output<PodSecurityContextArgs>> podSecurityContext() {
        return Optional.ofNullable(this.podSecurityContext);
    }

    @Import(name="port")
    private @Nullable Output<Integer> port;

    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    @Import(name="priorityClassName")
    private @Nullable Output<String> priorityClassName;

    public Optional<Output<String>> priorityClassName() {
        return Optional.ofNullable(this.priorityClassName);
    }

    /**
     * Readiness probe values for default backend. Ref: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#container-probes.
     * 
     */
    @Import(name="readinessProbe")
    private @Nullable Output<ProbeArgs> readinessProbe;

    /**
     * @return Readiness probe values for default backend. Ref: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#container-probes.
     * 
     */
    public Optional<Output<ProbeArgs>> readinessProbe() {
        return Optional.ofNullable(this.readinessProbe);
    }

    @Import(name="replicaCount")
    private @Nullable Output<Integer> replicaCount;

    public Optional<Output<Integer>> replicaCount() {
        return Optional.ofNullable(this.replicaCount);
    }

    @Import(name="resources")
    private @Nullable Output<ResourceRequirementsArgs> resources;

    public Optional<Output<ResourceRequirementsArgs>> resources() {
        return Optional.ofNullable(this.resources);
    }

    @Import(name="service")
    private @Nullable Output<ControllerDefaultBackendServiceArgs> service;

    public Optional<Output<ControllerDefaultBackendServiceArgs>> service() {
        return Optional.ofNullable(this.service);
    }

    @Import(name="serviceAccount")
    private @Nullable Output<ControllerServiceAccountArgs> serviceAccount;

    public Optional<Output<ControllerServiceAccountArgs>> serviceAccount() {
        return Optional.ofNullable(this.serviceAccount);
    }

    /**
     * Node tolerations for server scheduling to nodes with taints. Ref: https://kubernetes.io/docs/concepts/configuration/assign-pod-node/
     * 
     */
    @Import(name="tolerations")
    private @Nullable Output<List<TolerationArgs>> tolerations;

    /**
     * @return Node tolerations for server scheduling to nodes with taints. Ref: https://kubernetes.io/docs/concepts/configuration/assign-pod-node/
     * 
     */
    public Optional<Output<List<TolerationArgs>>> tolerations() {
        return Optional.ofNullable(this.tolerations);
    }

    private ControllerDefaultBackendArgs() {}

    private ControllerDefaultBackendArgs(ControllerDefaultBackendArgs $) {
        this.affinity = $.affinity;
        this.autoscaling = $.autoscaling;
        this.enabled = $.enabled;
        this.existingPsp = $.existingPsp;
        this.extraArgs = $.extraArgs;
        this.extraEnvs = $.extraEnvs;
        this.extraVolumeMounts = $.extraVolumeMounts;
        this.extraVolumes = $.extraVolumes;
        this.image = $.image;
        this.livenessProbe = $.livenessProbe;
        this.minAvailable = $.minAvailable;
        this.name = $.name;
        this.nodeSelector = $.nodeSelector;
        this.podAnnotations = $.podAnnotations;
        this.podLabels = $.podLabels;
        this.podSecurityContext = $.podSecurityContext;
        this.port = $.port;
        this.priorityClassName = $.priorityClassName;
        this.readinessProbe = $.readinessProbe;
        this.replicaCount = $.replicaCount;
        this.resources = $.resources;
        this.service = $.service;
        this.serviceAccount = $.serviceAccount;
        this.tolerations = $.tolerations;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ControllerDefaultBackendArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ControllerDefaultBackendArgs $;

        public Builder() {
            $ = new ControllerDefaultBackendArgs();
        }

        public Builder(ControllerDefaultBackendArgs defaults) {
            $ = new ControllerDefaultBackendArgs(Objects.requireNonNull(defaults));
        }

        public Builder affinity(@Nullable Output<AffinityArgs> affinity) {
            $.affinity = affinity;
            return this;
        }

        public Builder affinity(AffinityArgs affinity) {
            return affinity(Output.of(affinity));
        }

        public Builder autoscaling(@Nullable Output<AutoscalingArgs> autoscaling) {
            $.autoscaling = autoscaling;
            return this;
        }

        public Builder autoscaling(AutoscalingArgs autoscaling) {
            return autoscaling(Output.of(autoscaling));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param existingPsp Use an existing PSP instead of creating one.
         * 
         * @return builder
         * 
         */
        public Builder existingPsp(@Nullable Output<String> existingPsp) {
            $.existingPsp = existingPsp;
            return this;
        }

        /**
         * @param existingPsp Use an existing PSP instead of creating one.
         * 
         * @return builder
         * 
         */
        public Builder existingPsp(String existingPsp) {
            return existingPsp(Output.of(existingPsp));
        }

        public Builder extraArgs(@Nullable Output<Map<String,Map<String,String>>> extraArgs) {
            $.extraArgs = extraArgs;
            return this;
        }

        public Builder extraArgs(Map<String,Map<String,String>> extraArgs) {
            return extraArgs(Output.of(extraArgs));
        }

        public Builder extraEnvs(@Nullable Output<List<EnvVarArgs>> extraEnvs) {
            $.extraEnvs = extraEnvs;
            return this;
        }

        public Builder extraEnvs(List<EnvVarArgs> extraEnvs) {
            return extraEnvs(Output.of(extraEnvs));
        }

        public Builder extraEnvs(EnvVarArgs... extraEnvs) {
            return extraEnvs(List.of(extraEnvs));
        }

        /**
         * @param extraVolumeMounts Additional volumeMounts to the default backend container.  - name: copy-portal-skins    mountPath: /var/lib/lemonldap-ng/portal/skins
         * 
         * @return builder
         * 
         */
        public Builder extraVolumeMounts(@Nullable Output<List<VolumeMountArgs>> extraVolumeMounts) {
            $.extraVolumeMounts = extraVolumeMounts;
            return this;
        }

        /**
         * @param extraVolumeMounts Additional volumeMounts to the default backend container.  - name: copy-portal-skins    mountPath: /var/lib/lemonldap-ng/portal/skins
         * 
         * @return builder
         * 
         */
        public Builder extraVolumeMounts(List<VolumeMountArgs> extraVolumeMounts) {
            return extraVolumeMounts(Output.of(extraVolumeMounts));
        }

        /**
         * @param extraVolumeMounts Additional volumeMounts to the default backend container.  - name: copy-portal-skins    mountPath: /var/lib/lemonldap-ng/portal/skins
         * 
         * @return builder
         * 
         */
        public Builder extraVolumeMounts(VolumeMountArgs... extraVolumeMounts) {
            return extraVolumeMounts(List.of(extraVolumeMounts));
        }

        /**
         * @param extraVolumes Additional volumes to the default backend pod.  - name: copy-portal-skins    emptyDir: {}
         * 
         * @return builder
         * 
         */
        public Builder extraVolumes(@Nullable Output<List<VolumeArgs>> extraVolumes) {
            $.extraVolumes = extraVolumes;
            return this;
        }

        /**
         * @param extraVolumes Additional volumes to the default backend pod.  - name: copy-portal-skins    emptyDir: {}
         * 
         * @return builder
         * 
         */
        public Builder extraVolumes(List<VolumeArgs> extraVolumes) {
            return extraVolumes(Output.of(extraVolumes));
        }

        /**
         * @param extraVolumes Additional volumes to the default backend pod.  - name: copy-portal-skins    emptyDir: {}
         * 
         * @return builder
         * 
         */
        public Builder extraVolumes(VolumeArgs... extraVolumes) {
            return extraVolumes(List.of(extraVolumes));
        }

        public Builder image(@Nullable Output<ControllerImageArgs> image) {
            $.image = image;
            return this;
        }

        public Builder image(ControllerImageArgs image) {
            return image(Output.of(image));
        }

        /**
         * @param livenessProbe Liveness probe values for default backend. Ref: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#container-probes.
         * 
         * @return builder
         * 
         */
        public Builder livenessProbe(@Nullable Output<ProbeArgs> livenessProbe) {
            $.livenessProbe = livenessProbe;
            return this;
        }

        /**
         * @param livenessProbe Liveness probe values for default backend. Ref: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#container-probes.
         * 
         * @return builder
         * 
         */
        public Builder livenessProbe(ProbeArgs livenessProbe) {
            return livenessProbe(Output.of(livenessProbe));
        }

        public Builder minAvailable(@Nullable Output<Integer> minAvailable) {
            $.minAvailable = minAvailable;
            return this;
        }

        public Builder minAvailable(Integer minAvailable) {
            return minAvailable(Output.of(minAvailable));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param nodeSelector Node labels for default backend pod assignment Ref: https://kubernetes.io/docs/user-guide/node-selection/.
         * 
         * @return builder
         * 
         */
        public Builder nodeSelector(@Nullable Output<Map<String,String>> nodeSelector) {
            $.nodeSelector = nodeSelector;
            return this;
        }

        /**
         * @param nodeSelector Node labels for default backend pod assignment Ref: https://kubernetes.io/docs/user-guide/node-selection/.
         * 
         * @return builder
         * 
         */
        public Builder nodeSelector(Map<String,String> nodeSelector) {
            return nodeSelector(Output.of(nodeSelector));
        }

        /**
         * @param podAnnotations Annotations to be added to default backend pods.
         * 
         * @return builder
         * 
         */
        public Builder podAnnotations(@Nullable Output<Map<String,String>> podAnnotations) {
            $.podAnnotations = podAnnotations;
            return this;
        }

        /**
         * @param podAnnotations Annotations to be added to default backend pods.
         * 
         * @return builder
         * 
         */
        public Builder podAnnotations(Map<String,String> podAnnotations) {
            return podAnnotations(Output.of(podAnnotations));
        }

        /**
         * @param podLabels labels to add to the pod container metadata
         * 
         * @return builder
         * 
         */
        public Builder podLabels(@Nullable Output<Map<String,String>> podLabels) {
            $.podLabels = podLabels;
            return this;
        }

        /**
         * @param podLabels labels to add to the pod container metadata
         * 
         * @return builder
         * 
         */
        public Builder podLabels(Map<String,String> podLabels) {
            return podLabels(Output.of(podLabels));
        }

        /**
         * @param podSecurityContext Security Context policies for controller pods. See https://kubernetes.io/docs/tasks/administer-cluster/sysctl-cluster/ for notes on enabling and using sysctls.
         * 
         * @return builder
         * 
         */
        public Builder podSecurityContext(@Nullable Output<PodSecurityContextArgs> podSecurityContext) {
            $.podSecurityContext = podSecurityContext;
            return this;
        }

        /**
         * @param podSecurityContext Security Context policies for controller pods. See https://kubernetes.io/docs/tasks/administer-cluster/sysctl-cluster/ for notes on enabling and using sysctls.
         * 
         * @return builder
         * 
         */
        public Builder podSecurityContext(PodSecurityContextArgs podSecurityContext) {
            return podSecurityContext(Output.of(podSecurityContext));
        }

        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        public Builder priorityClassName(@Nullable Output<String> priorityClassName) {
            $.priorityClassName = priorityClassName;
            return this;
        }

        public Builder priorityClassName(String priorityClassName) {
            return priorityClassName(Output.of(priorityClassName));
        }

        /**
         * @param readinessProbe Readiness probe values for default backend. Ref: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#container-probes.
         * 
         * @return builder
         * 
         */
        public Builder readinessProbe(@Nullable Output<ProbeArgs> readinessProbe) {
            $.readinessProbe = readinessProbe;
            return this;
        }

        /**
         * @param readinessProbe Readiness probe values for default backend. Ref: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#container-probes.
         * 
         * @return builder
         * 
         */
        public Builder readinessProbe(ProbeArgs readinessProbe) {
            return readinessProbe(Output.of(readinessProbe));
        }

        public Builder replicaCount(@Nullable Output<Integer> replicaCount) {
            $.replicaCount = replicaCount;
            return this;
        }

        public Builder replicaCount(Integer replicaCount) {
            return replicaCount(Output.of(replicaCount));
        }

        public Builder resources(@Nullable Output<ResourceRequirementsArgs> resources) {
            $.resources = resources;
            return this;
        }

        public Builder resources(ResourceRequirementsArgs resources) {
            return resources(Output.of(resources));
        }

        public Builder service(@Nullable Output<ControllerDefaultBackendServiceArgs> service) {
            $.service = service;
            return this;
        }

        public Builder service(ControllerDefaultBackendServiceArgs service) {
            return service(Output.of(service));
        }

        public Builder serviceAccount(@Nullable Output<ControllerServiceAccountArgs> serviceAccount) {
            $.serviceAccount = serviceAccount;
            return this;
        }

        public Builder serviceAccount(ControllerServiceAccountArgs serviceAccount) {
            return serviceAccount(Output.of(serviceAccount));
        }

        /**
         * @param tolerations Node tolerations for server scheduling to nodes with taints. Ref: https://kubernetes.io/docs/concepts/configuration/assign-pod-node/
         * 
         * @return builder
         * 
         */
        public Builder tolerations(@Nullable Output<List<TolerationArgs>> tolerations) {
            $.tolerations = tolerations;
            return this;
        }

        /**
         * @param tolerations Node tolerations for server scheduling to nodes with taints. Ref: https://kubernetes.io/docs/concepts/configuration/assign-pod-node/
         * 
         * @return builder
         * 
         */
        public Builder tolerations(List<TolerationArgs> tolerations) {
            return tolerations(Output.of(tolerations));
        }

        /**
         * @param tolerations Node tolerations for server scheduling to nodes with taints. Ref: https://kubernetes.io/docs/concepts/configuration/assign-pod-node/
         * 
         * @return builder
         * 
         */
        public Builder tolerations(TolerationArgs... tolerations) {
            return tolerations(List.of(tolerations));
        }

        public ControllerDefaultBackendArgs build() {
            return $;
        }
    }

}
