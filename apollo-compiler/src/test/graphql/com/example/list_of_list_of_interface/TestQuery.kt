// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.example.nested_array

import com.apollographql.apollo.api.Operation
import com.apollographql.apollo.api.OperationName
import com.apollographql.apollo.api.Query
import com.apollographql.apollo.api.Response
import com.apollographql.apollo.api.ResponseField
import com.apollographql.apollo.api.ScalarTypeAdapters
import com.apollographql.apollo.api.ScalarTypeAdapters.Companion.DEFAULT
import com.apollographql.apollo.api.internal.OperationRequestBodyComposer
import com.apollographql.apollo.api.internal.QueryDocumentMinifier
import com.apollographql.apollo.api.internal.ResponseFieldMapper
import com.apollographql.apollo.api.internal.ResponseFieldMarshaller
import com.apollographql.apollo.api.internal.ResponseReader
import com.apollographql.apollo.api.internal.SimpleOperationResponseParser
import com.apollographql.apollo.api.internal.Throws
import kotlin.Array
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import okio.Buffer
import okio.BufferedSource
import okio.ByteString
import okio.IOException

@Suppress("NAME_SHADOWING", "UNUSED_ANONYMOUS_PARAMETER", "LocalVariableName",
    "RemoveExplicitTypeArguments", "NestedLambdaShadowedImplicitParameter")
class TestQuery : Query<TestQuery.Data, TestQuery.Data, Operation.Variables> {
  override fun operationId(): String = OPERATION_ID
  override fun queryDocument(): String = QUERY_DOCUMENT
  override fun wrapData(data: Data?): Data? = data
  override fun variables(): Operation.Variables = Operation.EMPTY_VARIABLES
  override fun name(): OperationName = OPERATION_NAME
  override fun responseFieldMapper(): ResponseFieldMapper<Data> = ResponseFieldMapper.invoke {
    Data(it)
  }

  @Throws(IOException::class)
  override fun parse(source: BufferedSource, scalarTypeAdapters: ScalarTypeAdapters): Response<Data>
      = SimpleOperationResponseParser.parse(source, this, scalarTypeAdapters)

  @Throws(IOException::class)
  override fun parse(byteString: ByteString, scalarTypeAdapters: ScalarTypeAdapters): Response<Data>
      = parse(Buffer().write(byteString), scalarTypeAdapters)

  @Throws(IOException::class)
  override fun parse(source: BufferedSource): Response<Data> = parse(source, DEFAULT)

  @Throws(IOException::class)
  override fun parse(byteString: ByteString): Response<Data> = parse(byteString, DEFAULT)

  override fun composeRequestBody(scalarTypeAdapters: ScalarTypeAdapters): ByteString =
      OperationRequestBodyComposer.compose(
    operation = this,
    autoPersistQueries = false,
    withQueryDocument = true,
    scalarTypeAdapters = scalarTypeAdapters
  )

  override fun composeRequestBody(): ByteString = OperationRequestBodyComposer.compose(
    operation = this,
    autoPersistQueries = false,
    withQueryDocument = true,
    scalarTypeAdapters = DEFAULT
  )

  override fun composeRequestBody(
    autoPersistQueries: Boolean,
    withQueryDocument: Boolean,
    scalarTypeAdapters: ScalarTypeAdapters
  ): ByteString = OperationRequestBodyComposer.compose(
    operation = this,
    autoPersistQueries = autoPersistQueries,
    withQueryDocument = withQueryDocument,
    scalarTypeAdapters = scalarTypeAdapters
  )

  interface DescriptionFilterDescriptionElement {
    fun marshaller(): ResponseFieldMarshaller
  }

  data class AsTextFilterDescriptionElement(
    val __typename: String = "TextFilterDescriptionElement",
    val type: String,
    val displayName: String
  ) : DescriptionFilterDescriptionElement {
    override fun marshaller(): ResponseFieldMarshaller = ResponseFieldMarshaller.invoke { writer ->
      writer.writeString(RESPONSE_FIELDS[0], this@AsTextFilterDescriptionElement.__typename)
      writer.writeString(RESPONSE_FIELDS[1], this@AsTextFilterDescriptionElement.type)
      writer.writeString(RESPONSE_FIELDS[2], this@AsTextFilterDescriptionElement.displayName)
    }

    companion object {
      private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
          ResponseField.forString("__typename", "__typename", null, false, null),
          ResponseField.forString("type", "type", null, false, null),
          ResponseField.forString("displayName", "displayName", null, false, null)
          )

      operator fun invoke(reader: ResponseReader): AsTextFilterDescriptionElement = reader.run {
        val __typename = readString(RESPONSE_FIELDS[0])!!
        val type = readString(RESPONSE_FIELDS[1])!!
        val displayName = readString(RESPONSE_FIELDS[2])!!
        AsTextFilterDescriptionElement(
          __typename = __typename,
          type = type,
          displayName = displayName
        )
      }

      @Suppress("FunctionName")
      fun Mapper(): ResponseFieldMapper<AsTextFilterDescriptionElement> = ResponseFieldMapper {
          invoke(it) }
    }
  }

  data class AsIconFilterDescriptionElement(
    val __typename: String = "IconFilterDescriptionElement",
    val type: String,
    val name: String
  ) : DescriptionFilterDescriptionElement {
    override fun marshaller(): ResponseFieldMarshaller = ResponseFieldMarshaller.invoke { writer ->
      writer.writeString(RESPONSE_FIELDS[0], this@AsIconFilterDescriptionElement.__typename)
      writer.writeString(RESPONSE_FIELDS[1], this@AsIconFilterDescriptionElement.type)
      writer.writeString(RESPONSE_FIELDS[2], this@AsIconFilterDescriptionElement.name)
    }

    companion object {
      private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
          ResponseField.forString("__typename", "__typename", null, false, null),
          ResponseField.forString("type", "type", null, false, null),
          ResponseField.forString("name", "name", null, false, null)
          )

      operator fun invoke(reader: ResponseReader): AsIconFilterDescriptionElement = reader.run {
        val __typename = readString(RESPONSE_FIELDS[0])!!
        val type = readString(RESPONSE_FIELDS[1])!!
        val name = readString(RESPONSE_FIELDS[2])!!
        AsIconFilterDescriptionElement(
          __typename = __typename,
          type = type,
          name = name
        )
      }

      @Suppress("FunctionName")
      fun Mapper(): ResponseFieldMapper<AsIconFilterDescriptionElement> = ResponseFieldMapper {
          invoke(it) }
    }
  }

  data class AsImageFilterDescriptionElement(
    val __typename: String = "ImageFilterDescriptionElement",
    val type: String,
    val image: String
  ) : DescriptionFilterDescriptionElement {
    override fun marshaller(): ResponseFieldMarshaller = ResponseFieldMarshaller.invoke { writer ->
      writer.writeString(RESPONSE_FIELDS[0], this@AsImageFilterDescriptionElement.__typename)
      writer.writeString(RESPONSE_FIELDS[1], this@AsImageFilterDescriptionElement.type)
      writer.writeString(RESPONSE_FIELDS[2], this@AsImageFilterDescriptionElement.image)
    }

    companion object {
      private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
          ResponseField.forString("__typename", "__typename", null, false, null),
          ResponseField.forString("type", "type", null, false, null),
          ResponseField.forString("image", "image", null, false, null)
          )

      operator fun invoke(reader: ResponseReader): AsImageFilterDescriptionElement = reader.run {
        val __typename = readString(RESPONSE_FIELDS[0])!!
        val type = readString(RESPONSE_FIELDS[1])!!
        val image = readString(RESPONSE_FIELDS[2])!!
        AsImageFilterDescriptionElement(
          __typename = __typename,
          type = type,
          image = image
        )
      }

      @Suppress("FunctionName")
      fun Mapper(): ResponseFieldMapper<AsImageFilterDescriptionElement> = ResponseFieldMapper {
          invoke(it) }
    }
  }

  data class Description(
    val __typename: String = "FilterDescriptionElement",
    val asTextFilterDescriptionElement: AsTextFilterDescriptionElement?,
    val asIconFilterDescriptionElement: AsIconFilterDescriptionElement?,
    val asImageFilterDescriptionElement: AsImageFilterDescriptionElement?
  ) {
    fun marshaller(): ResponseFieldMarshaller = ResponseFieldMarshaller.invoke { writer ->
      writer.writeString(RESPONSE_FIELDS[0], this@Description.__typename)
      writer.writeFragment(this@Description.asTextFilterDescriptionElement?.marshaller())
      writer.writeFragment(this@Description.asIconFilterDescriptionElement?.marshaller())
      writer.writeFragment(this@Description.asImageFilterDescriptionElement?.marshaller())
    }

    companion object {
      private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
          ResponseField.forString("__typename", "__typename", null, false, null),
          ResponseField.forFragment("__typename", "__typename", listOf(
            ResponseField.Condition.typeCondition(arrayOf("TextFilterDescriptionElement"))
          )),
          ResponseField.forFragment("__typename", "__typename", listOf(
            ResponseField.Condition.typeCondition(arrayOf("IconFilterDescriptionElement"))
          )),
          ResponseField.forFragment("__typename", "__typename", listOf(
            ResponseField.Condition.typeCondition(arrayOf("ImageFilterDescriptionElement"))
          ))
          )

      operator fun invoke(reader: ResponseReader): Description = reader.run {
        val __typename = readString(RESPONSE_FIELDS[0])!!
        val asTextFilterDescriptionElement =
            readFragment<AsTextFilterDescriptionElement>(RESPONSE_FIELDS[1]) { reader ->
          AsTextFilterDescriptionElement(reader)
        }
        val asIconFilterDescriptionElement =
            readFragment<AsIconFilterDescriptionElement>(RESPONSE_FIELDS[2]) { reader ->
          AsIconFilterDescriptionElement(reader)
        }
        val asImageFilterDescriptionElement =
            readFragment<AsImageFilterDescriptionElement>(RESPONSE_FIELDS[3]) { reader ->
          AsImageFilterDescriptionElement(reader)
        }
        Description(
          __typename = __typename,
          asTextFilterDescriptionElement = asTextFilterDescriptionElement,
          asIconFilterDescriptionElement = asIconFilterDescriptionElement,
          asImageFilterDescriptionElement = asImageFilterDescriptionElement
        )
      }

      @Suppress("FunctionName")
      fun Mapper(): ResponseFieldMapper<Description> = ResponseFieldMapper { invoke(it) }
    }
  }

  /**
   * Data from the response after executing this GraphQL operation
   */
  data class Data(
    val description: List<Description>?
  ) : Operation.Data {
    override fun marshaller(): ResponseFieldMarshaller = ResponseFieldMarshaller.invoke { writer ->
      writer.writeList(RESPONSE_FIELDS[0], this@Data.description) { value, listItemWriter ->
        value?.forEach { value ->
          listItemWriter.writeObject(value.marshaller())}
      }
    }

    companion object {
      private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
          ResponseField.forList("description", "description", null, true, null)
          )

      operator fun invoke(reader: ResponseReader): Data = reader.run {
        val description = readList<Description>(RESPONSE_FIELDS[0]) { reader ->
          reader.readObject<Description> { reader ->
            Description(reader)
          }
        }?.map { it!! }
        Data(
          description = description
        )
      }

      @Suppress("FunctionName")
      fun Mapper(): ResponseFieldMapper<Data> = ResponseFieldMapper { invoke(it) }
    }
  }

  companion object {
    const val OPERATION_ID: String =
        "24f14babcf3086dc3d5a445d1cb5c5de862172a2ee876f8a8e02e77488a1cf08"

    val QUERY_DOCUMENT: String = QueryDocumentMinifier.minify(
          """
          |query TestQuery {
          |  description {
          |    __typename
          |    ... on TextFilterDescriptionElement {
          |      type
          |      displayName
          |    }
          |    ... on IconFilterDescriptionElement {
          |      type
          |      name
          |    }
          |    ... on ImageFilterDescriptionElement {
          |      type
          |      image
          |    }
          |  }
          |}
          """.trimMargin()
        )

    val OPERATION_NAME: OperationName = object : OperationName {
      override fun name(): String = "TestQuery"
    }
  }
}
