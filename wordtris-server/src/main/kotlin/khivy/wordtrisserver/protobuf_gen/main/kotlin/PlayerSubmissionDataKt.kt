//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: PlayerSubmissionData.proto

@kotlin.jvm.JvmName("-initializeplayerSubmissionData")
inline fun playerSubmissionData(block: PlayerSubmissionDataKt.Dsl.() -> kotlin.Unit): PlayerSubmissionDataOuterClass.PlayerSubmissionData =
  PlayerSubmissionDataKt.Dsl._create(PlayerSubmissionDataOuterClass.PlayerSubmissionData.newBuilder()).apply { block() }._build()
object PlayerSubmissionDataKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    private val _builder: PlayerSubmissionDataOuterClass.PlayerSubmissionData.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: PlayerSubmissionDataOuterClass.PlayerSubmissionData.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): PlayerSubmissionDataOuterClass.PlayerSubmissionData = _builder.build()

    /**
     * <code>int32 score = 1;</code>
     */
    var score: kotlin.Int
      @JvmName("getScore")
      get() = _builder.getScore()
      @JvmName("setScore")
      set(value) {
        _builder.setScore(value)
      }
    /**
     * <code>int32 score = 1;</code>
     */
    fun clearScore() {
      _builder.clearScore()
    }

    /**
     * <code>string name = 2;</code>
     */
    var name: kotlin.String
      @JvmName("getName")
      get() = _builder.getName()
      @JvmName("setName")
      set(value) {
        _builder.setName(value)
      }
    /**
     * <code>string name = 2;</code>
     */
    fun clearName() {
      _builder.clearName()
    }

    /**
     * <code>string ip = 3;</code>
     */
    var ip: kotlin.String
      @JvmName("getIp")
      get() = _builder.getIp()
      @JvmName("setIp")
      set(value) {
        _builder.setIp(value)
      }
    /**
     * <code>string ip = 3;</code>
     */
    fun clearIp() {
      _builder.clearIp()
    }

    /**
     * <code>bytes words = 4;</code>
     */
    var words: com.google.protobuf.ByteString
      @JvmName("getWords")
      get() = _builder.getWords()
      @JvmName("setWords")
      set(value) {
        _builder.setWords(value)
      }
    /**
     * <code>bytes words = 4;</code>
     */
    fun clearWords() {
      _builder.clearWords()
    }

    /**
     * <code>bytes checksum = 5;</code>
     */
    var checksum: com.google.protobuf.ByteString
      @JvmName("getChecksum")
      get() = _builder.getChecksum()
      @JvmName("setChecksum")
      set(value) {
        _builder.setChecksum(value)
      }
    /**
     * <code>bytes checksum = 5;</code>
     */
    fun clearChecksum() {
      _builder.clearChecksum()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun PlayerSubmissionDataOuterClass.PlayerSubmissionData.copy(block: PlayerSubmissionDataKt.Dsl.() -> kotlin.Unit): PlayerSubmissionDataOuterClass.PlayerSubmissionData =
  PlayerSubmissionDataKt.Dsl._create(this.toBuilder()).apply { block() }._build()
