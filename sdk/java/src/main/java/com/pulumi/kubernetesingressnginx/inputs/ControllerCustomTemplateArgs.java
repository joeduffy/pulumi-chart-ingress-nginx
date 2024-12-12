// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetesingressnginx.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ControllerCustomTemplateArgs extends com.pulumi.resources.ResourceArgs {

    public static final ControllerCustomTemplateArgs Empty = new ControllerCustomTemplateArgs();

    @Import(name="configMapKey")
    private @Nullable Output<String> configMapKey;

    public Optional<Output<String>> configMapKey() {
        return Optional.ofNullable(this.configMapKey);
    }

    @Import(name="configMapName")
    private @Nullable Output<String> configMapName;

    public Optional<Output<String>> configMapName() {
        return Optional.ofNullable(this.configMapName);
    }

    private ControllerCustomTemplateArgs() {}

    private ControllerCustomTemplateArgs(ControllerCustomTemplateArgs $) {
        this.configMapKey = $.configMapKey;
        this.configMapName = $.configMapName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ControllerCustomTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ControllerCustomTemplateArgs $;

        public Builder() {
            $ = new ControllerCustomTemplateArgs();
        }

        public Builder(ControllerCustomTemplateArgs defaults) {
            $ = new ControllerCustomTemplateArgs(Objects.requireNonNull(defaults));
        }

        public Builder configMapKey(@Nullable Output<String> configMapKey) {
            $.configMapKey = configMapKey;
            return this;
        }

        public Builder configMapKey(String configMapKey) {
            return configMapKey(Output.of(configMapKey));
        }

        public Builder configMapName(@Nullable Output<String> configMapName) {
            $.configMapName = configMapName;
            return this;
        }

        public Builder configMapName(String configMapName) {
            return configMapName(Output.of(configMapName));
        }

        public ControllerCustomTemplateArgs build() {
            return $;
        }
    }

}
