// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: svga.proto
package com.opensource.svgaplayer.proto;

import com.squareup.wire.AndroidMessage;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoAdapterJvm;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;

import java.util.List;

import okio.ByteString;

public final class SpriteEntity extends AndroidMessage<SpriteEntity, SpriteEntity.Builder> {
  public static final ProtoAdapter<SpriteEntity> ADAPTER = ProtoAdapterJvm.newMessageAdapter(SpriteEntity.class);

  public static final Creator<SpriteEntity> CREATOR = AndroidMessage.newCreator(ADAPTER);

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_IMAGEKEY = "";

  /**
   * 元件所对应的位图键名, 如果 imageKey 含有 .vector 后缀，该 sprite 为矢量图层。
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String imageKey;

  /**
   * 帧列表
   */
  @WireField(
      tag = 2,
      adapter = "com.opensource.svgaplayer.proto.FrameEntity#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<FrameEntity> frames;

  public SpriteEntity(String imageKey, List<FrameEntity> frames) {
    this(imageKey, frames, ByteString.EMPTY);
  }

  public SpriteEntity(String imageKey, List<FrameEntity> frames, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.imageKey = imageKey;
    this.frames = Internal.immutableCopyOf("frames", frames);
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.imageKey = imageKey;
    builder.frames = Internal.copyOf("frames", frames);
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof SpriteEntity)) return false;
    SpriteEntity o = (SpriteEntity) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(imageKey, o.imageKey)
        && frames.equals(o.frames);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (imageKey != null ? imageKey.hashCode() : 0);
      result = result * 37 + frames.hashCode();
      super.hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<SpriteEntity, Builder> {
    public String imageKey;

    public List<FrameEntity> frames;

    public Builder() {
      frames = Internal.newMutableList();
    }

    /**
     * 元件所对应的位图键名, 如果 imageKey 含有 .vector 后缀，该 sprite 为矢量图层。
     */
    public Builder imageKey(String imageKey) {
      this.imageKey = imageKey;
      return this;
    }

    /**
     * 帧列表
     */
    public Builder frames(List<FrameEntity> frames) {
      Internal.checkElementsNotNull(frames);
      this.frames = frames;
      return this;
    }

    @Override
    public SpriteEntity build() {
      return new SpriteEntity(imageKey, frames, super.buildUnknownFields());
    }
  }
}
